## Getting Started

Welcome to the VS Code Java world. This guide will help you set up and understand the structure of a Java project using **design patterns**: **Singleton** and **Factory Method**, based on a command management system for an online store.

## Folder Structure

The workspace contains the following folders:

- `src`: Contains Java source files including:
  - Product interfaces and implementations
  - Product factories
  - Order and order list management (Singleton)
  - Main class for testing
- `lib`: Maintains any external libraries or dependencies
- `bin`: Generated compiled class files (by default)

You can customize this structure via `.vscode/settings.json`.

## Project Overview

This project implements:

1. **Factory Pattern** – To dynamically create product instances from various categories:
   - Food products (`ProduitAlimentaire`)
   - Electronic products (`ProduitElectronique`)
   - Clothing products (`ProduitVestimentaire`)

2. **Singleton Pattern** – To centralize and manage the list of all orders in a single shared instance (`ListeCommandes`).

## Functional Requirements

- Users can create products by category.
- Each order (`Commande`) contains multiple products.
- All orders are managed centrally by a Singleton.
- Orders display product details and total prices.

## Technical Constraints

- Products must be created through specialized `ProduitFactory` classes.
- The product interface (`Produit`) standardizes how all products are handled.
- Commands and the global order list should be extensible for new product types.

## How to Run

1. Implement or complete classes in `src/` following the provided skeleton.
2. Use the `Main` class to create products and place them in orders.
3. The Singleton `ListeCommandes` keeps track of all submitted orders.
4. Use `afficherCommande()` and `afficherToutesLesCommandes()` methods to print order details.

For further help with dependency management and configuration in VS Code, see the [official documentation](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
