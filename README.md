# 75 Hard Android Prototype

Academic Android prototype developed for a **Mobile and Ubiquitous Computing** course project during the 2024/2025 academic year.

The project explores an Android interface for tracking activities related to the **75 Hard challenge**, using **Kotlin**, **Jetpack Compose** and **Navigation Compose**.

> This repository contains the prototype version that was preserved from the original academic work. It does **not** implement every requirement from the final assignment specification.

## Implemented prototype scope

- Android application written in Kotlin
- Jetpack Compose user interface
- Navigation between application screens
- Login/user identifier prototype
- Main dashboard/navigation screen
- Prototype screens for:
  - challenge progress
  - workouts
  - water tracking
  - food
  - reading
  - sleep
- Initial Room entity model for a user

Several feature screens remain placeholders because this repository reflects the available prototype rather than a reconstructed final submission.

## Project structure

```text
app/src/main/java/ip/ipp/estg/desafio_75_hard/
├── MainActivity.kt
├── EntryScreen.kt
├── LoginScreen.kt
├── StartJourneyPage.kt
├── MainPageScreen.kt
├── ChallengeProgressScreen.kt
├── WorkoutScreen.kt
├── WaterScreen.kt
├── FoodScreen.kt
├── BookScreen.kt
├── SleepScreen.kt
├── userID.kt
├── Models/
│   └── User.kt
└── ui/theme/
```

## Requirements

- Android Studio
- Android SDK 34
- JDK compatible with the Android Gradle Plugin used by the project

## Running the project

1. Clone the repository.
2. Open the project in Android Studio.
3. Allow Gradle to synchronize the dependencies.
4. Run the `app` configuration on an Android emulator or physical device with Android 9 (API 28) or newer.

## Privacy and repository cleanup

The public portfolio version intentionally excludes local IDE configuration, credentials, synchronization tokens and other machine-specific/private files from the original academic archive. An image asset of uncertain redistribution provenance was also removed and replaced with a Compose-only header. An unused plaintext-password field from the early Room prototype was removed rather than publishing an insecure storage pattern.

## Academic context

This project was originally developed as part of a group academic assignment. This repository is presented as a portfolio snapshot of the implementation that remained available, without claiming completion of functionality that is not present in the source code.
