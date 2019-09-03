# Spring Boot 2 Oauth2 JWT 
## Client To Server and Server To Server

## Generate jwt.jks file
keytool -genkeypair -alias oauth2 -keyalg RSA -keypass password -keystore jwt.jks -storepass oauth2

## Build and Run the Projects
```
cd jwtresource/
gradlew bootrun

cd jwtserver/
gradlew bootrun
```
## Post with credentials to get the token
```
http://localhost:9000/oauth/token

Server To Server Form:
grant_type: client_credentials 

Client To Server Form:
grant_type: password
username: user
password: pass

Basic Auth:
username: clientId
password: secret

Header:
Content-Type: application/x-www-form-urlencoded
```
### Post Return
```
{
  "access_token": "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6WyJyZWFkIiwid3JpdGUiXSwiZXhwIjoxNTY3NTEzNzQwLCJhdXRob3JpdGllcyI6WyJST0xFX0NMSUVOVCJdLCJqdGkiOiJhMGJmNWYyNy0yZDc5LTRkMDQtYjFhYi1kZGUwNGI5OTc0ODciLCJjbGllbnRfaWQiOiJjbGllbnRJZCJ9.hL1xvrenzLAaWnjoeBa0Y2O3TxBqJVdwGs9QfO4Dmgy2m3WmNtNOi8i5NJU1vAnUPelJ8svjpghVy81Be3xjuHUs_-QE8pm8zcJUxQZyfRmbWmJHluZ6TrTnMg-WyFxRFAc3G8C2Xq7BG7s8OfT_nQ20HR3UP_VYnWmqJ-TEXJHnnvKkya3LYWUpsmsYNRSe8S_dXsWk2lOiSiqGOaJLZdV99tc5jgdqroBXQESMYpUHcRJBU_F6bpnhbaKDlEKcsm1OVkV3rk9K6UrQyWyXfUPWDpdKSM3e4lP-dId2U5H12qgKXxt1dBI_2YkxfnHMYAcCShAtqXKyOGBi0ose8A",
  "token_type": "bearer",
  "expires_in": 299,
  "scope": "read write",
  "jti": "a0bf5f27-2d79-4d04-b1ab-dde04b997487"
}
```
# Client Principal
```
http://localhost:9000/api/client-details

http://localhost:9100/me

Bearer Token:
The token generated from the post above

Header:
Content-Type: application/x-www-form-urlencoded
```
