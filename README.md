## Getting Started

Welcome to the Library Management Java Project! This guide helps you understand the structure and functionality of an object-oriented application for managing a digital library.

## Project Overview

This project simulates the operations of a library using Java, implementing key object-oriented principles such as inheritance, interfaces, abstract classes, and exception handling.

## Folder Structure

- `src`: Java source files, including:
  - Abstract base class `Livre`
  - Interface `Empruntable`
  - Literary and educational book categories
  - Library management class `Bibliotheque`
  - Exception classes
  - Console interface
- `lib`: Any external libraries or dependencies
- `bin`: Compiled Java class files (default output location)

## Functional Requirements

- Add new books (Roman or Manuel) to the library
- Display available books
- Borrow books by ID
- Return borrowed books
- Prevent invalid actions via exception handling

## Book Classification

- **Littérature** (e.g., Romans, BD, Nouvelles) via `LivreLitteraire`
- **Éducation** (e.g., Manuels, Revues scientifiques) via `LivreEducatif`

Books are created using an abstract `Livre` class and categorized through inheritance. The `Empruntable` interface standardizes borrowing/return actions.

## Technical Features

- **Object-Oriented Design**:
  - Abstract classes for core definitions
  - Inheritance for specialization
  - Interface for standard actions
- **Data Handling**:
  - Dynamic storage of books using `LinkedList<Livre>`
- **User Interface**:
  - Console-based menu for user interactions
- **Error Handling**:
  - Custom exceptions like `LivreIndisponibleException`, `LivreNonEmprunteException`

## How to Run

1. Compile all Java classes in the `src/` folder.
2. Run the `Main` class to launch the console interface.
3. Follow the menu prompts to interact with the library.

## Tools

- Java
- Visual Studio Code or any preferred Java IDE
