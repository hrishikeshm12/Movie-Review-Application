
# Movie Review Application

![SpringBoot_App_Cover_1](https://github.com/user-attachments/assets/090ebb82-9586-4de5-b3d5-9863362b7d6d)


## Table of Contents
- [About](#about)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgements](#acknowledgements)

## About

This Movie Review Application is a full-stack project developed as part of a comprehensive course. It allows users to browse movies, watch trailers, and leave reviews. The application showcases a loosely coupled architecture with a clear separation between the frontend and backend.

![SpringBoot_App_Cover_3](https://github.com/user-attachments/assets/c245ce57-0ead-4bf5-a8a4-27fb0a65ed64)
![SpringBoot_App_Cover_2](https://github.com/user-attachments/assets/cfe83ca6-1b42-40ce-aefa-2288f55f9db5)


## Features

- Browse a collection of movies
- Watch movie trailers
- Read and write movie reviews
- Responsive design for various devices

## Tech Stack

- **Frontend**: React, Bootstrap
- **Backend**: Java, Spring Boot
- **Database**: MongoDB
- **Additional Tools**: Postman (for API testing)

## Getting Started

### Prerequisites

- JDK (Java Development Kit)
- Node.js and npm
- MongoDB Atlas account
- IntelliJ IDEA (recommended for backend development)

### Installation

1. Clone the repository
   ```
   git clone https://github.com/hrishikeshm12/Movie-Review-Application.git

   ```

2. Backend Setup
- Open the backend project in IntelliJ IDEA
- Configure MongoDB connection in `application.properties`
- Run the Spring Boot application

3. Frontend Setup
   ```
   cd MovieClient/movie-app
   npm install
   npm start

   ```

## Usage

After starting both the backend and frontend servers, navigate to `http://localhost:3000` in your web browser to use the application.

## API Endpoints

- GET `/api/v1/movies`: Fetch all movies
- GET `/api/v1/movies/{imdbId}`: Fetch a specific movie
- POST `/api/v1/reviews`: Create a new review

For a complete list of endpoints, please refer to the backend documentation.

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

