# Mobile Automation with Appium

## Overview

This project demonstrates mobile automation testing using Appium. It automates interactions with an Android application, performing tasks such as navigating through views, changing date settings, and handling UI elements.

## Table of Contents

- [Technologies](#technologies)
- [Setup](#setup)
- [Usage](#usage)
- [Code Structure](#code-structure)
- [Contributing](#contributing)
- [License](#license)

## Technologies

- **Java**: The programming language used for the automation scripts.
- **Appium**: An open-source tool for automating mobile applications.
- **Selenium WebDriver**: Used for interacting with the mobile app's UI.
- **Android**: Target platform for the mobile application.

## Setup

### Prerequisites

- Java Development Kit (JDK) installed.
- Android Studio and SDK installed.
- Appium server installed and running.
- An Android emulator or physical device connected.

### Installation Steps

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Ghaida222/webookMobileApp.git
   cd webookMobileApp

2. **Set Up Your Environment**:
-Ensure that the Appium server is running on your machine.
-Update the path to your APK in the code:
caps.setCapability(MobileCapabilityType.APP, "path_to_your_apk"); // Update this path

3. **Compile and Run**:
Open the project in your preferred IDE (e.g., IntelliJ IDEA).
Run the AutomationApp java class.

## Usage 
The main functionalities of the automation script include:
-Connecting and setup the driver
-Pressing UI Buttons: Navigates to the "Buttons" section and interacts with toggle buttons.
-Changing Date: Automates the process of changing the date using the date widget.
-Navigating Back: Returns to the home page after performing actions.

## Code Structure
-Base/AutomationApp.java: The main automation script containing methods for different actions.
-pressYesNoButton(): Automates pressing buttons.
-changeDate(): Automates changing the date.
-navigateBackToHomePage(): Handles navigation back to the home page.

## Author
Ghaida Bin Muhaib
