

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/hello?name=John'
    }
    response {
        status OK()
        body("""{"message": "Hello, John!"}""")
    }
}