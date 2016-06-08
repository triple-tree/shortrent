# mysql initialization


## create the user and grant appropriate privileges
```bash
CREATE USER 'admin'@'localhost' IDENTIFIED BY 'admin';
GRANT ALL PRIVILEGES ON *.* TO 'admin'@'localhost' WITH GRANT OPTION;
CREATE USER 'admin'@'%' IDENTIFIED BY 'admin';
GRANT ALL PRIVILEGES ON *.* TO 'admin'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;
# To see the privileges for an account, use SHOW GRANTS:
SHOW GRANTS FOR 'admin'@'localhost';

# import initialization data from terminal
mysql -uadmin -p --default-character-set=utf8 < initialization.sql

echo 'drop database shortrent' | mysql -uadmin -p
echo 'create database shortrent' | mysql -uadmin -p

```

## materials
- [How To Create a New User and Grant Permissions in MySQL](https://www.digitalocean.com/community/tutorials/how-to-create-a-new-user-and-grant-permissions-in-mysql)
- [Adding User Accounts](http://dev.mysql.com/doc/refman/5.7/en/adding-users.html)