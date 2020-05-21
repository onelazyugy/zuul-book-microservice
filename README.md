### A spring boot microservice that will be proxied through a Zuul proxy
(https://github.com/onelazyugy/zuul-proxy)
- This microservice serves 2 APIs
    - GET 
        - http://localhost:8333/book/api/v1/book
    - POST 
        - http://localhost:8333/book/api/v1/save-book
        - request body
        <code>
            {
                "book": {
                    "id": 1,
                    "name": "jacket",
                    "color": "pink",
                    "category": "clothing"
                }
            }
        </code>
        - response body
        <code>
        {
            "success": true,
            "message": "success",
            "book": {
                "id": 1,
                "name": "jacket",
                "color": "pink",
                "category": "clothing"
            }
        }
        </code>
    