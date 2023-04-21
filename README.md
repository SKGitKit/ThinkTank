# ThinkTank

ThinkTank is an Android app that allows users to collaborate on solving problems of any kind of locality. Each day, users vote for what they think is the optimal solution to a given problem, and then work together to iterate upon it.

## Features

- User authentication: Allows users to sign up, log in, and manage their profiles.
- Problem selection: Presents users with a new problem to collaborate on each day.
- Problem discussion: Provides a platform for users to discuss and collaborate on solutions to the daily problem.
- Solution voting: Allows users to vote on which solution they think is the best.
- Iteration: Enables users to iterate on the winning solution further.

## UI Flow

Here is the UI flow for the ThinkTank app:

### Onboarding Flow
- Welcome screen with app logo and a call-to-action to create an account or sign in
- Sign up page with input fields for name, email, and password
- Confirmation screen that welcomes the user and provides a brief overview of the app's features

### Home Screen Flow
- Home screen with a list of ongoing problems to solve, sorted by popularity or date posted
- Problem details screen with a description of the problem and its current proposed solutions
- Voting screen where users can cast their vote for the solution they believe is best
- Results screen showing the winning solution and its vote count, with an option to iterate and improve upon it

### Collaborative Flow
- Collaborative workspace screen with a list of team members and their roles
- Messaging feature for team members to communicate and exchange ideas
- Solution iteration screen where team members can propose modifications to the winning solution and vote on them
- Final solution screen that showcases the latest iteration with a brief explanation of how it addresses the problem

### Profile Flow
- Profile screen with user's basic information, including name, profile picture, and bio
- Activity history screen that showcases the user's voting history and collaborative contributions
- Settings screen where users can customize their account, including notification preferences and privacy settings


## Technologies and Tools Used

- Android SDK
- Kotlin programming language
- Firebase (authentication, real-time database, and messaging)
- Retrofit (HTTP client for Android)
- OkHttp (networking library for Android)
- Coroutines (asynchronous programming library for Android)
- Android Jetpack (a set of libraries, tools, and guidance for building high-quality Android apps)

## Installation and Usage

1. Clone this repository to your local machine.
2. Open the project in Android Studio.
3. Set up your Firebase project and add the `google-services.json` file to the project.
4. Run the app on an emulator or physical device.

## Contributing

Contributions are welcome! Please feel free to submit a pull request or create an issue if you find a bug or have a suggestion for a new feature.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
