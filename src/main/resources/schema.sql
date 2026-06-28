-- Create country table
create table if not exists country (
   co_code varchar(2) primary key,
   co_name varchar(50) not null
);