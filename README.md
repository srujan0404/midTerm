# Fake Store API
## Description
This is a fake store API that allows you to get, post, put and delete products and users. It is a simple API that is used to practice and learn about RESTful APIs and how to create them. It is also used to practice using Postman to test the API.


## API Endpoints

### Carts

#### Get all carts
```
GET /carts/
```
![alt text](image.png)

This api endpoint will return all the carts in the database.

#### Get cart by id
```
GET /carts/id/
```

![alt text](image-1.png)
This api endpoint will return a cart by its id.


#### Create a new cart
```
POST /carts
```
![alt text](image-2.png)

This is will create new Cart


#### Update the Cart
```
POST /carts/id
```

![alt text](image-3.png)

This is will update the existing cart

#### Delete a cart

```
DELETE /carts/{id}
```

![alt text](image-4.png)

#### Get Cart Items in a Date Range
```
GET /api/carts/dateRange?startDate={start date}&endDate={end date}
```

![alt text](image-5.png)

This will return a list of Cart Items in provided date range 
