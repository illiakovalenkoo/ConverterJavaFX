# ConverterJavaFX - JavaFX Unit Converter

**ConverterJavaFX** is a JavaFX-based desktop application designed for **unit conversion**. It allows users to enter a numerical value and select a unit of measurement, then converts the value into different weight units: **grams (g), kilograms (kg), and tons (t)**.

## 1. How to Download and Run the Project

### **Prerequisites**

To run this project, you need to have:

- **Java Development Kit (JDK) 23** installed. Download from [Adoptium JDK](https://adoptium.net/) or use OpenJDK.
- **JavaFX SDK 23** installed. Download from [Gluon JavaFX](https://gluonhq.com/products/javafx/) or [OpenJFX](https://openjfx.io/).

### **Windows**

1. **Download the repository**:

   ```sh
   git clone https://github.com/illiakovalenkoo/ConverterJavaFX
   cd ConverterJavaFX
   ```

2. **Run the application**:

   - **Option 1: Using the `.exe` file**
     Download and run [**Konwerter.exe**](./Konwerter.exe).

   - **Option 2: Running the `.jar` file**
     Ensure you have JDK 23 installed. Run:

     ```sh
     java -jar konwerter.jar
     ```

     If JavaFX is missing, use:

     ```sh
     java --module-path "your_full_path_to_javafx_sdk\lib" --add-modules javafx.controls,javafx.fxml -jar "your_full_path_to_project\ConverterJavaFX\src\konwerter3\out\artifacts\konwerter3_jar\konwerter3.jar""
     ```

     For example, if JavaFX 23.0.2 SDK is installed on Windows:

     ```sh
     java --module-path "C:\Users\user\Downloads\openjfx-23.0.2_windows-x64_bin-sdk\javafx-sdk-23.0.2\lib" --add-modules javafx.controls,javafx.fxml -jar "C:\Users\user\IdeaProjects\ConverterJavaFX\src\konwerter3\out\artifacts\konwerter3_jar\konwerter3.jar"
     ```

### **Linux**

1. **Download the repository**:

   ```sh
   git clone https://github.com/illiakovalenkoo/ConverterJavaFX
   cd ConverterJavaFX
   ```

2. **Install Java and JavaFX (if not installed)**:

   ```sh
   sudo apt update && sudo apt install openjdk-23-jdk
   wget https://download2.gluonhq.com/openjfx/23/openjfx-23_linux-x64_bin-sdk.zip
   unzip openjfx-23_linux-x64_bin-sdk.zip
   ```

3. **Run the application**:

   ```sh
   java -jar konwerter3.jar
   ```

   If JavaFX is missing, use:

   ```sh
   java --module-path "your_full_path_to_javafx_sdk/lib" --add-modules javafx.controls,javafx.fxml -jar konwerter3.jar
   ```

   Example for Linux with JavaFX 23.0.2:
   ```sh
   java --module-path "/home/user/javafx-sdk-23.0.2/lib" --add-modules javafx.controls,javafx.fxml -jar konwerter3.jar
   ```

## 2. First-Time Execution Issues

If you're running the `.exe` file for the first time, you might encounter the following issues:

- **Java not installed** → Install **JDK 23**.
- **JavaFX not found** → Either install JavaFX SDK or use the `.jar` directly with the correct module path.
- **Missing `.jar` file** → Ensure `konwerter.jar` is present in working directory.

## 3. Project Structure

```
/                            # Root project directory
│── src/                              # Source code of the application
│── images/                           # Screenshots of tests
│── doc/                              # README file
```

## 4. Technologies Used

- **Java 23**
- **JavaFX 23**
- **Maven**
- **Launch4j** (for `.exe` generation)

## 5. Application Testing

The application has been tested for:

- **Unit conversions for grams, kilograms, and tons**
- **User input validation**
- **Graphical interface responsiveness**
- **Performance on different screen resolutions**

### `images/` Folder

A test image has been added to the `images/` folder for UI verification.
- img.png - Correct input line,  measurement units are grams
- img2.png -
- iimg.3png -
## 6. License

This project is licensed under the **MIT License**.  
You are free to use, modify, and distribute this software with no restrictions.  
The software is provided "as is", without warranty of any kind.


