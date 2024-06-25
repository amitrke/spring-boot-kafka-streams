FROM gradle:jdk17-jammy

RUN apt update
RUN apt install git -y
#Install telnet
RUN apt install telnet -y
WORKDIR /app
CMD tail -f /dev/null