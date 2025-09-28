# Adapter Design Pattern Demo

## Overview
This project demonstrates the **Adapter Pattern**, a structural design pattern that allows objects with incompatible interfaces to work together. The Adapter acts as a bridge, translating requests from a client to a service that would otherwise be incompatible.

In this example, we have temperature services that provide data in different units (Celsius and Kelvin). The **TemperatureAdapter** unifies these services under a single interface (`TemperatureService`) for the client.

## Project Structure

adapter-demo
└── src

└── adapter

├── TemperatureService.java // Target interface

├── CelsiusTemperatureService.java // Adaptee 1

├── KelvinTemperatureService.java // Adaptee 2

├── TemperatureAdapter.java // Object Adapter

└── AdapterDemo.java // Demonstration

## Components

1. **Target Interface (`TemperatureService`)**  
   Defines the operations expected by the client (Celsius and Fahrenheit methods).

2. **Adaptees (`CelsiusTemperatureService`, `KelvinTemperatureService`)**  
   Existing services with incompatible interfaces.

3. **Adapter (`TemperatureAdapter`)**  
   Implements the target interface and internally calls methods of the adaptees, converting the data as needed.

4. **Client (`AdapterDemo`)**  
   Uses the adapter to interact with the services through the unified interface.

---

## How to Run

1. Compile all classes in the `adapter` package.
2. Run `AdapterDemo`:

```bash
javac adapter/*.java
java adapter.AdapterDemo
```

## Expected Output
Temperature in Farenheits: (from Celsius): 77.0
Temperature in Celsius: (from Kelvin): 25.0

## Learning Outcomes
Understand the role and structure of the Adapter Pattern.
Learn how adapters bridge incompatible interfaces.
Explore Object Adapter implementation using composition.
Observe how multiple services can be unified under a single interface for client convenience.

## Notes 
This example can be extended to other units or services (e.g., Fahrenheit to Kelvin).
Follows Single Responsibility Principle: adapter handles conversions, client remains unaware of underlying details.
