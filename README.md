# API Spec

## Autentication

All request must be have API Key

Request:
- Header:
  - X-Api-Key: "your secret api key"

## Create Kehadiran Tamu

Request:
- Method: POST
- Endpoint: `api/v1/kehadiran`
- Header:
  - Content-Type: application/json
  - Accept: application/json
- Body
```json
{
  "id": "string, unique",
  "name": "string",
  "kehadiran": "boolean",
  "jumlah_kehadiran" : "number",
  "id_pernikahan": "string"
}
```

Response:

```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
    "id": "string, unique",
    "name": "string",
    "kehadiran": "boolean",
    "jumlah_kehadiran" : "number",
    "id_pernikahan": "string",
    "created_at": "data",
    "updated_at": null
  }
}
```

## List Kehadiran Tamu (Optional)

## Create Ucapan dan Doa

Request:
- Method: POST
- Endpoint: `api/v1/ucapandoa`
- Header:
  - Content-Type: application/json
  - Accept: application/json
- Body
```json
{
  "id": "string, unique",
  "name": "string",
  "ucapan": "string",
  "id_pernikahan": "string"
}
```

Response:

```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
    "id": "string, unique",
    "name": "string",
    "ucapan": "string",
    "id_pernikahan": "string",
    "created_at": "data",
    "updated_at": null
  }
}
```


## List Ucapan dan Doa

Request:
- Method: POST
- Endpoint: `api/v1/ucapandoa/pernikahan/{id_pernikahan}`
- Header:
  - Accept: application/json
- Query Param :
  - size: number
  - page: number

Response:

```json
{
  "code" : "number",
  "status" : "string",
  "data" : [
    {
      "id": "string, unique",
      "name": "string",
      "ucapan": "string"
    }
  ]
}
```























