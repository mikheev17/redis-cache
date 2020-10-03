# redis-cache

./mvnw clean package
docker-compose up


curl --location --request POST 'localhost:8080/api/v1/books' \  
--header 'Content-Type: application/json' \  
--data-raw '{  
    "name": "book1",  
    "description": "blabla",  
    "price": 100500  
}' 


MBP-Maksim:~ mikheev$ docker exec -it rc-redis sh  
# redis-cli  
127.0.0.1:6379> KEYS *  
1) "bc::2"  
2) "bc::1"  
127.0.0.1:6379> FLUSHALL  
OK  
127.0.0.1:6379> 


docker logs -f 6f767bc19768 


curl --location --request GET 'localhost:8080/api/v1/books'  
