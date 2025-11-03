# HackMissiles (Forge 1.16.5)
This repository contains a complete Forge 1.16.5 mod skeleton for "HackMissiles".

## How to build locally
- Install Java 8 JDK
- Open repository in IntelliJ IDEA or run terminal inside project root
- Run `./gradlew build`
- The mod jar will be created in `build/libs/`

## GitHub Actions (automatic build)
- Create a new repository on GitHub
- Push the contents of this folder to the repo (or upload zip & extract)
- On push to `main`, GitHub Actions will run and upload an artifact named `hackmissiles-mod`
- Download the `.jar` from the Actions artifact and place it in your `mods/` folder.

## Notes
- This project is a functional skeleton and contains simplified entity/block logic.
- You can expand `EntityMissile` explosion logic, add models/textures, and replace placeholder assets.
