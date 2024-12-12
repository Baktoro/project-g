# Overview #

Project G is a basic 3D engine built in Java, designed to render 3D environments and allow user interaction through keyboard and mouse inputs. It was developed years ago, following a tutorial i can no longer remember the name of. The goal of this project was for me to better understand the Java language (although, looking back, 3d graphics was not the best path to achieve this goal, due to its complexity). Therefore, you might find some bad coding practices and some designing mistakes, such as the fact that it does not utilize the GPU but relies exclusively on the CPU to render.

# Features #

- 3D Rendering: Basic 3D rendering using custom algorithms
- Texture Mapping: Renders textured surfaces.
- User Interaction: Keyboard and mouse input handling.

# Prerequisites #

- Java Development Kit (JDK): Version 11 or later.
- Operating System: Compatible with Windows, Linux and macOS (although not tested on macOS).

# Setup #

1. Compile the Project
1.1. Navigate to the project directory:
	~ cd "Project G"
1.2. Compile the source code:
	~ javac -d bin resources $(find src -name "*.java")
2. Run the project.
	Execute the main class:
	~ java -cp bin:resources com.project.projectg.Display
