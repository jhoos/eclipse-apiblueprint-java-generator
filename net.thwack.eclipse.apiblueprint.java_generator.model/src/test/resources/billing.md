FORMAT: 1A

# Billing API - In Progress -
This document describes the REST APIs used by the billing system.

All API resources described in this document, with the exception of the Authentication resource, must be accessed
using an appropriate authentication token.  This token is returned by the Authentication resource after successful
authentication, and must be passed to subsequent API calls using the HTTP `Authentication` header, like so:

    Authentication: Bearer <token>

where `<token>` is the token returned by the Authentication resource.

# Group Shared Representations
Representations that are shared by all groups, such as error responses.

# Group Login
Resources related to user authentication and session management

## Authentication [/authenticate]
Authentication is token-based, as described at https://auth0.com/blog/2014/01/07/angularjs-authentication-with-cookies-vs-token/ . 

The `GET` method will return a token which must be passed to subsequent API requests via an HTTP Bearer Token Authentication header, like:

    Authentication: Bearer <token>
    Whee!
    Are we having fun yet?

This resource is the only resource that can be accessed without that header being present in the request.

The token returned by the server is a cryptographically-signed or encrypted entity that the server can use to 
maintain state.  It should be a [JSON Web Token](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-30#ref-JWS),
although ultimately its contents are intended to be opaque to clients.

### Authenticate [GET]
Authenticates a user and returns a session token.  For security purposes this request should come over HTTPS.

+ Request
    ```
    {
      "id": "joeuser",
      "password": "Pl3as3_L3t_Me_1n!"
    }
    ```

+ Response 200
    ```
    {
      "token": "3487987ad89787c787f8a878s7d78787ead9a",
      "id": "joeuser",
      "firstName": "Joe",
      "lastName": "User"
    }
    ```

+ Response 401
    ```
    {
      "error": "The user name or password was incorrect"
    }
    ```
