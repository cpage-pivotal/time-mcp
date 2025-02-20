# Time MCP Server

This MCP Server provides an LLM interface for getting the current time from the public World Time API. It was built with the [Spring AI MCP](https://spring.io/blog/2024/12/11/spring-ai-mcp-announcement) project.

![Sample](images/sample.png)

## Building the Server

```bash
./mvnw clean package
```

## Configuration

You will need to supply a configuration for the server for your MCP Client. Here's what the configuration looks like for [claude_desktop_config.json](https://modelcontextprotocol.io/quickstart/user):

```
{
  "mcpServers": {
    "time-mcp": {
      "command": "java",
      "args": [
        "-Dlogging.file.name=time-mcp.webmvc.log",
        "-jar",
        "/path/to/time-mcp/target/time-mcp-0.0.1-SNAPSHOT.jar",
        "--server.port=8022"
      ]
    }
  }
}
```
