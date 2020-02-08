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
    descriptionProject varchar(250) not null ,
    statusIdProject int not null
);
create table projectTracker.item
(
    itemId int unsigned auto_increment primary key ,
    titleItem varchar(60)not null ,
    descriptionItem varchar(250)not null ,
    statusIdProject int not null ,
    typeId int not null
);
create table projectTracker.comment
(
    commentId int unsigned auto_increment primary key ,
    textComment varchar(3000) not null ,
    itemId int not null
)
