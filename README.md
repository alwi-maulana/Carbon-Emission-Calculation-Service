
# 🔢 Carbon Emission Calculation Service

Carbon Emission Calculation Service is a stateless service responsible for calculating carbon emissions based on input data.




## Responsibilities

- Calculate carbon emission (kg) per event
- Validate calculation input (amount, factor)
- Return calculation result and status (SUCCESS / FAILED)
- Does not access database


## Key Features

- RESTful API
- Stateless & lightweight
- Uses BigDecimal for precise calculation
- Designed to be easily replaceable or scalable


# Role in Architecture

This service focuses purely on business calculation logic and can be invoked by other services (e.g., Carbon Activity Service).


## Tech Stack

**Server:** Java, SpringBoot, Rest API



## Deployment on localhost:8081

To deploy this project run 

```bash
  mvn spring-boot:run   
```


## Additional Info

This Service is linked to the 1st service (Carbon-Core-Service)

so run both service to simulate the process

