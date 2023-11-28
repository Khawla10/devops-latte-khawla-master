FROM golang:1.20-alpine
WORKDIR /app
COPY go.mod go.sum ./


#WORKDIR /app
#
#COPY ./src /app
#
RUN go mod download
COPY . .
RUN go build -o api-golang
#
#
#COPY *.go ./
#
#RUN go build -o /go-docker-demo
#
EXPOSE 8080
#
CMD ["./api-golang" ]