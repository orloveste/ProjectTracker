create  schema projectTracker;
create table  projectTracker.status
(
    idStatus int unsigned auto_increment primary key,
    nameStatus varchar(60) not null
);
create table projectTracker.type
(
    idType int unsigned auto_increment primary key,
    nameType varchar(60) not null
);
create table projectTracker.project
(
    idProject int unsigned auto_increment primary key,
    nameProject varchar(60) not null ,
    shortNameProject varchar(12) not null ,
    descriptionProject varchar(250) not null,
    idStatus int unsigned,
    foreign key (idStatus) references projectTracker.status(idStatus)
);
create table projectTracker.item
(
    itemId int unsigned auto_increment primary key ,
    titleItem varchar(60)not null ,
    descriptionItem varchar(250)not null ,
    idStatus int unsigned,
    idType int unsigned,
    foreign key (idType) references projectTracker.type (idType),
    foreign key (idStatus) references projectTracker.status(idStatus)
);
create table projectTracker.comment
(
    commentId int unsigned auto_increment primary key ,
    textComment varchar(3000) not null ,
    itemId int unsigned,
    foreign key (itemId) references projectTracker.item (itemId)
);
insert into projecttracker.type (nameType) values ('urgent');
insert into projecttracker.status (nameStatus) values ('Open');
insert into projecttracker.project (nameProject, shortNameProject, descriptionProject, idStatus)
values ('FirstProj', 'Pr-1', 'test first connection', 1 );
insert into projecttracker.item (titleItem, descriptionItem, idStatus, idType)
values ('Unable to connect', 'log in fail', 1, 1);
insert into projecttracker.comment (textComment, itemId)
values ('toDo Create,update,delete', 1)
