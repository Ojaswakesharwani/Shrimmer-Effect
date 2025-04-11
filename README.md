# Shrimmer Effect

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![GitHub stars](https://img.shields.io/github/stars/Ojaswakesharwani/Shrimmer-Effect)](https://github.com/Ojaswakesharwani/Shrimmer-Effect/stargazers)
[![GitHub issues](https://img.shields.io/github/issues/Ojaswakesharwani/Shrimmer-Effect)](https://github.com/Ojaswakesharwani/Shrimmer-Effect/issues)

A modern Android sample project demonstrating the implementation of a **shimmer effect** for loading UI elements. This project shows how to integrate the Facebook Shimmer library to display animated placeholders while your actual content is loading in RecyclerViews. The repo includes both horizontal and vertical layouts with a comprehensive code structure that’s production-ready.

## Table of Contents

- [Features](#features)
- [Demo Video](#demo-video)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features

- **Shimmer Effect Integration:** Uses [Facebook Shimmer](https://github.com/facebook/shimmer-android) to show placeholder loading animations.
- **Multiple Layouts:** Separate implementations for horizontal and vertical RecyclerViews.
- **Modern UI:** Clean and modern user interface with a toolbar and search functionality.
- **Production Ready:** Modular and well-documented code for easy maintenance and scalability.
- **Sample Data:** Demonstrates dynamic data loading with a sample dataset for team profiles.

## Demo Video

Below is a continuously playing demo video of the Shrimmer Effect in action. The video auto-plays on page load and loops indefinitely to give potential users and contributors an immediate preview of the application.

<div align="center">
  <video width="480" height="480" controls autoplay loop muted>
    <source src="https://your-hosting-link.com/your-demo-video.mp4" type="video/mp4">
    Your browser does not support the video tag.
  </video>
</div>

## Video

Here is a video showcasing the shimmer effect and overall layout of the app:

https://github.com/user-attachments/assets/3705c33a-090a-431b-97d5-31454fed026f


## Installation

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Ojaswakesharwani/Shrimmer-Effect.git
   cd Shrimmer-Effect
Open in Android Studio:
Open the project in Android Studio. Make sure you have the latest version of Android Studio and the required SDKs installed.

Sync Gradle:
Allow Android Studio to sync Gradle dependencies. The project uses the Facebook Shimmer dependency:

gradle
Copy
Edit
implementation 'com.facebook.shimmer:shimmer:0.5.0'
Build and Run:
Build the project and run it on your emulator or physical device.

Usage
The main activity demonstrates how to initialize the shimmer effect on RecyclerViews. When the activity is first launched, the shimmer placeholders are displayed. After a simulated data load (using a delay), the actual data (sample team profiles) is shown.

You can examine the following key files for implementation details:

MainActivity.kt – Sets up the shimmer effect, RecyclerView adapters, and sample data.

activity_main.xml – Contains the layout including the shimmer and RecyclerView elements.

shimmer_item.xml and shimmer_horizontal_item.xml – Define the shimmer placeholder designs.

Contributing
Contributions are always welcome! If you have ideas for improvements, feature requests, or bug fixes, please open an issue or submit a pull request.

Fork the repository.

Create your feature branch (git checkout -b feature/MyFeature).

Commit your changes (git commit -m 'Add some feature').

Push to the branch (git push origin feature/MyFeature).

Open a pull request.

License
This project is licensed under the MIT License.
