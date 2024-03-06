FROM ubuntu:latest
LABEL authors="zzang"

ENTRYPOINT ["top", "-b"]