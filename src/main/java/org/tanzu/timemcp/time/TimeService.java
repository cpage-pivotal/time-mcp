package org.tanzu.timemcp.time;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class TimeService {
    private final RestTemplate restTemplate;
    private static final String API_URL = "http://worldtimeapi.org/api/ip";

    public TimeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Tool(description = "Get the current time")
    public TimeResponse getCurrentTime() {
        try {
            return restTemplate.getForObject(API_URL, TimeResponse.class);
        } catch (RestClientException e) {
            throw new RuntimeException("Failed to fetch current time", e);
        }
    }

    // Time response model
    public record TimeResponse(
            String datetime,
            String timezone,
            String utc_datetime,
            String utc_offset
    ) {}
}
