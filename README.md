# My Prose App

A Java project demonstrating text composition using sentence and prose elements.

[![Build Status](https://img.shields.io/github/actions/workflow/status/joha1na/my-prose-app/maven.yml?branch=main&label=CI)](https://github.com/joha1na/my-prose-app/actions/workflows/maven.yml)
[![Release](https://img.shields.io/github/v/release/joha1na/my-prose-app)](https://github.com/joha1na/my-prose-app/releases)
[![Maven Central](https://img.shields.io/maven-central/v/de.htw_berlin.fb4.examples/prose_library?color=brightgreen)](https://search.maven.org/artifact/de.htw_berlin.fb4.examples/prose_library)
[![License: GPL-3.0](https://img.shields.io/badge/License-GPL--3.0-orange.svg)](https://www.gnu.org/licenses/gpl-3.0)
[![Java](https://img.shields.io/badge/Java-23-blue.svg)](https://www.oracle.com/java/technologies/javase/jdk23-archive-downloads.html)
[![JUnit](https://img.shields.io/badge/JUnit-4.13.2-brightgreen.svg)](https://junit.org/junit4/)
[![JavaDoc](https://img.shields.io/badge/JavaDoc-Online-green.svg)](https://joha1na.github.io/my-prose-app/apidocs/)
[![Issues](https://img.shields.io/github/issues/joha1na/my-prose-app)](https://github.com/joha1na/my-prose-app/issues)

## Description

My Prose App is a project that implements and demonstrates the usage of the prose_builder library to showcase text composition capabilities. The project provides a practical demonstration of how to work with textual elements, convert between different text representations, and construct more complex texts from simple components using the Prose and Sentence interfaces.

The core of this project is the `prose_library` component, which implements the Sentence and Prose interfaces and provides tools for text manipulation.

## Features

- Implementation of Prose and Sentence interfaces
- Conversion between Prose and Sentence objects
- Simple text composition mechanism
- Maven-based build system
- Comprehensive documentation
- Continuous Integration via GitHub Actions
- Complete Open Source compliance documentation

## Project Structure

This project consists of:
- Implementation classes for text manipulation
- Example code showing practical usage
- Documentation of the implementation

## Development Setup

To set up the development environment and contribute to this project:

### Prerequisites

Before you begin, ensure you have met the following requirements:
- JDK 23 or higher installed
- Maven 3.8+ installed
- Git installed
- Your favorite Java IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Setting Up Local Development Environment

1. Clone the repository:
```bash
git clone https://github.com/joha1na/my-prose-app.git
cd my-prose-app
```

2. Build the project:
```bash
mvn clean install
```

3. Import the project into your IDE:
   - For IntelliJ IDEA: File > Open > Select the project directory
   - For Eclipse: File > Import > Existing Maven Projects > Select the project directory
   - For VS Code: Open folder and install Java extensions

### Project Organization

- `src/main/java/` - Source code of the library
- `src/test/java/` - Test cases
- `src/site/` - Documentation site configuration
- `release-assets/` - Contains release artifacts

## Requirements

- Java 23 or higher
- Maven 3.8 or higher
- Git (for cloning the repository)

## License

This project is licensed under the [GNU General Public License v3.0](LICENSE).

## Contributing

We welcome contributions to the My Prose App project! Please see our [Contributing Guidelines](CONTRIBUTING.md) for detailed information. For code of conduct, see [Code of Conduct](CODE_OF_CONDUCT.md).

### Contribution Workflow

1. **Fork the Repository**: Create your own fork of the project on GitHub

2. **Create a Branch**: Create a branch for your feature or bug fix
   ```bash
   git checkout -b feature/your-feature-name
   ```

3. **Make Your Changes**: Implement your changes, following the coding standards

4. **Write or Update Tests**: Ensure your code is properly tested
   ```bash
   mvn test
   ```

5. **Generate Documentation**: Update JavaDocs if needed
   ```bash
   mvn javadoc:javadoc
   ```

6. **Submit a Pull Request**: Push your changes to your fork and open a pull request

### Coding Standards

- Follow Java coding conventions
- Write JavaDoc comments for all public methods and classes
- Maintain a clean commit history with meaningful commit messages
- Ensure all tests pass before submitting a pull request

### Reporting Issues

If you find a bug or have a suggestion for improvement:
1. Check if the issue already exists in the GitHub issues
2. If not, create a new issue using one of our issue templates with a clear description and reproduction steps

### Security

For security-related issues, please review our [Security Policy](SECURITY.md) before submitting a report.

## Author

- Jana Maire ([@joha1na](https://github.com/joha1na))
