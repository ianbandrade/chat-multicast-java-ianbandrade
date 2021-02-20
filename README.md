<div align="center">
  <a href="#about">About</a>
   &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#techs">Techs</a>
  &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#run">Run</a>
&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#commands">Commands</a>
  &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#license">License</a>
</div>

## About

There is a simple Multicast Chat program

## Techs

- Java 1.8

## Run

### Clone the repository

```bash
# Clone Repository
$ git clone https://github.com/PUC-DISCIPLINAS/chat-multicast-java-ianbandrade.git
```

### Run Server

```bash
# Go to folder
$ cd chat-multicast-java-ianbandrade/out/production/chat-multicast-java-ianbandrade

# Start the server
$ java Server
```

The console going to show the result

### Run Client

```bash
# Go to folder
$ cd chat-multicast-java-ianbandrade/out/production/chat-multicast-java-ianbandrade

# Start the server
$ java Client
```

The console going to show the result

## Commands

```Markdown
:list_rooms - list the created server rooms
:create_room - create a room
:join_room - join into a room (format example: '/224.0.0.0')
:exit_room - (just into a room), exit of a room
:list_members - (just into a room), list the online users in the room
:list_users - list online users on the server
:exit - exit of the program
```

## License

This project is under the MIT license. See the file [LICENSE](LICENSE) for more details.
