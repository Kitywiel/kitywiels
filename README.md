# Kitywiel's Addon for Meteor Client

A simple addon for Meteor Client (Minecraft 1.21.4) by kitywiel that adds logging functionality.

## Features

- **Logger Module**: Logs your position and other game information at configurable intervals

## Building

1. Make sure you have JDK 21 installed
2. Run `./gradlew build` (Linux/Mac) or `gradlew.bat build` (Windows)
3. The built jar will be in `build/libs/`

## Installation

1. Build the addon or download the jar
2. Place the jar in your `.minecraft/mods` folder
3. Make sure Meteor Client is also installed
4. Launch Minecraft with Fabric

## Usage

1. Open Meteor Client GUI (Right Shift by default)
2. Navigate to the Misc category
3. Enable the Logger module
4. Configure settings as desired

## Development

To add more modules:
1. Create a new class in `src/main/java/com/example/addon/modules/`
2. Extend the `Module` class
3. Register it in `LoggerAddon.java`

## License

MIT License - see LICENSE file for details
