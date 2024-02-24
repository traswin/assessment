-- Drop tables if they exist
DROP TABLE IF EXISTS user_ticket CASCADE;



CREATE TABLE lottery
(
    id          SERIAL      PRIMARY KEY,
    ticket      VARCHAR(6)  NOT NULL,
    price       INTEGER     NOT NULL,
    amount      INTEGER     NOT NULL
);

CREATE TABLE user_ticket
(
    id          SERIAL      PRIMARY KEY,
    userid      INTEGER     NOT NULL,
    ticketid    VARCHAR(6)  NOT NULL

);

-- Initial data
INSERT INTO lottery(ticket, price, amount)
VALUES ('000001', 80, 1);
INSERT INTO lottery(ticket, price, amount)
VALUES ('000002', 80, 1);
insert into user_ticket(userid,ticketid)
values (1,'123456');
insert into user_ticket(userid,ticketid)
values (2,'123457');
