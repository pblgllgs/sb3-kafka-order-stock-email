# Microservice pattern using Spring boot 3 with Kafka

## Kafka platform 

```bash
docker compose up -d
```

## Microservices

Run all microservices, then send a request in post method

```bash
curl --location 'http://localhost:8080/api/v1/orders' \
--header 'Content-Type: application/json' \
--data '{
    "name":"Handmade Granite Shirt",
    "qty":"658",
    "price":898.40
}'
```

The logs in the services will show the received event.

## Send email

Need to add 2 env variables. Email sender and password token from your email provider.

```.env
EMAIL_FROM=
PASSWORD_APPLICATION_GOOGLE=
```