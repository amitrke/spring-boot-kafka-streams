FROM gradle:jdk17-jammy

RUN apt update
RUN apt install git -y
WORKDIR /app
CMD tail -f /dev/null