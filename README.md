# Java ChatGPT Integration

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=flat-square)

A Java application demonstrating how to integrate with the ChatGPT API using the `chatgpt-java` library. This project provides a simple example of creating conversational interactions with ChatGPT directly from Java code.

## Overview

This project showcases a minimal Java integration with OpenAI's ChatGPT service. It uses the `chatgpt-java` wrapper library to authenticate, establish a conversation, and send asynchronous messages to the ChatGPT model, receiving AI-generated responses in return.

## Features

- Seamless ChatGPT API integration from Java
- Asynchronous message handling with callback support
- Conversation-based interaction model
- Cloudflare bypass support via session tokens and user agent configuration

## Prerequisites

- **Java** 11 or higher
- A valid ChatGPT session token (obtained from browser cookies)
- Cloudflare clearance token (obtained from browser cookies)

## Getting Started

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/danielcregg/java-ChatGPT-integration.git
   cd java-ChatGPT-integration
   ```

2. Ensure the `chatgpt-java-1.0.2.jar` library is on your classpath.

### Usage

1. Open `Main.java` and replace the placeholder session token, Cloudflare clearance, and user agent values with your own credentials.

2. Compile and run:
   ```bash
   javac -cp chatgpt-java-1.0.2.jar Main.java
   java -cp .:chatgpt-java-1.0.2.jar Main
   ```

3. The application will send a message to ChatGPT and print the response to the console.

## Tech Stack

- **Language:** Java
- **Library:** [chatgpt-java](https://github.com/AcaiSoftware/chatgpt-java) v1.0.2

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
