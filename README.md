# Konwerter - JavaFX Unit Converter

## 📖 Project Overview
**Konwerter** is a JavaFX-based desktop application designed for **unit conversion**.  
It allows users to enter a numerical value and select a unit of measurement,  
then converts the value into different weight units: **grams (g), kilograms (kg), and tons (t)**.

---

## 🚀 Features
✔ **Convert values between different weight units** (g, kg, t)  
✔ **Simple and intuitive JavaFX UI**  
✔ **Instant calculations upon selection**  
✔ **Lightweight and fast execution**  
✔ **Works as `.jar` and `.exe`**  

---

## 🛠 How It Works
1. **Enter a numeric value** (e.g., `1500`).
2. **Select the input unit** (grams, kilograms, or tons).
3. **The program automatically converts the value** to the other units.

**Example:**
- Input: **1500 g**
- Output:  
  - **1.5 kg**
  - **0.0015 t**

---

## 📦 System Requirements

### **1️⃣ Java Development Kit (JDK)**
- Download **JDK 23+**: [Adoptium JDK](https://adoptium.net/)  
- Verify installation:
  ```sh
  java -version
  ```

### **2️⃣ JavaFX SDK**
- Download **JavaFX 23 SDK**: [Gluon JavaFX](https://gluonhq.com/products/javafx/)  
- Extract and set up JavaFX libraries.

---

## 💻 How to Run the Application

### **Option 1: Running from IntelliJ IDEA**
1. Open the project in **IntelliJ IDEA**.
2. Ensure **JavaFX SDK** is loaded in dependencies.
3. Run the `MainApplication` class.

### **Option 2: Running as a JAR**
1. **Build the project** using Maven:
   ```sh
   mvn clean package
   ```
2. **Run the JAR file**:
   ```sh
   java --module-path "C:\path\to\javafx-sdk-23.0.2\lib" --add-modules javafx.controls,javafx.fxml -jar target/konwerter.jar
   ```

### **Option 3: Running as an EXE (Windows)**
1. Use **Launch4j** to generate an `.exe` file.
2. Run `Conwerter.exe` located in the project directory.

---

## 🛠 Built With
- **Java 23**
- **JavaFX 23**
- **Maven**
- **Launch4j (for `.exe` creation)**

---

## 📜 License
This project is licensed under the **MIT License** – feel free to use and modify it.  

🚀 **Happy coding!**
