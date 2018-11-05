org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/countries'
    }
    response {
        status 200
        body(
                file("allCountries.json")
        )
    }
}