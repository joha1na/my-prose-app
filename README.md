# My Prose App

A Java project demonstrating text composition using sentence and prose elements.

## Description

My Prose App is a project that implements and demonstrates the usage of the prose_builder library to showcase text composition capabilities. The project provides a practical demonstration of how to work with textual elements, convert between different text representations, and construct more complex texts from simple components using the Prose and Sentence interfaces.

The core of this project is the `prose_library` component, which implements the Sentence and Prose interfaces and provides tools for text manipulation.

## Features

- Implementation of Prose and Sentence interfaces
- Conversion between Prose and Sentence objects
- Simple text composition mechanism
- Maven-based build system
- Comprehensive documentation

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

We welcome contributions to the My Prose App project! Here's how you can contribute:

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
2. If not, create a new issue with a clear description and reproduction steps

## Author

- Jana Maire ([@joha1na](https://github.com/joha1na))
