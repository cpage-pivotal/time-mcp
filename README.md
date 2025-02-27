# Time MCP Server

This MCP Server provides an LLM interface for getting the current time from the public World Time API. It was built with the [Spring AI MCP](https://spring.io/blog/2024/12/11/spring-ai-mcp-announcement) project.

![Sample](images/sample.png)

## Building the Server

```bash
./mvnw clean package
```

Alternatively, you can download the pre-built server from the [Releases](https://github.com/cpage-pivotal/time-mcp/releases/tag/1.0.0-snapshot) page.

## Configuration

You will need to supply a configuration for the server for your MCP Client. To run the Claude Desktop client on OSX, you will edit the config file at `~/Library/Application\ Support/Claude/claude_desktop_config.json`

Here's what the configuration looks like for [claude_desktop_config.json](https://modelcontextprotocol.io/quickstart/user):

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
