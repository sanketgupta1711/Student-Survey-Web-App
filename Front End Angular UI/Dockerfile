FROM node:alpine

# set the current working directory for all commands

WORKDIR /usr/src/app

 

COPY package.json .

COPY package-lock.json .

RUN npm install

 

COPY . .

 

EXPOSE 4200

 

CMD /usr/src/app/node_modules/.bin/ng serve --host 0.0.0.0 --disableHostCheck