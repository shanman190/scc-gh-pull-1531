

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/hello'
    }
    response {
        status OK()
        body("""{"message": "Hello, world!"}""")
    }
}