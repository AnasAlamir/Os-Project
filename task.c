#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int choice;
    char username[50];
    char password[20];
    char groupname[50];
    char newInfo[100];
    char option[50];
    char value[50];
    char command[200];
    char t;
    while (1) {
        printf("\nMenu:\n");
        printf("1. Add user\n");
        printf("2. Delete user\n");
        printf("3. Add group\n");
        printf("4. Delete group\n");
        printf("5. Change user info\n");
        printf("6. Change account info\n");
        printf("7. Assign user to group\n");
        printf("8. List all users\n");
        printf("9. List all groups\n");
        printf("10. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        t = getchar();
        switch (choice) {
            case 1:
                printf("Enter username: ");
                scanf("%s", username);
                printf("Enter password: ");
                scanf("%s",password);
                strcpy(command, "sudo useradd ");
                strcat(command, username);
                system(command);
                break;
            case 2:
                printf("Enter username: ");
                scanf("%s", username);
                strcpy(command, "sudo deluser ");
                strcat(command, username);
                system(command);
                break;
            case 3:
                printf("Enter groupname: ");
                scanf("%s", groupname);
                strcpy(command, "sudo addgroup ");
                strcat(command, groupname);
                system(command);
                break;
            case 4:
                printf("Enter groupname: ");
                scanf("%s", groupname);
                strcpy(command, "sudo delgroup ");
                strcat(command, groupname);
                system(command);
                break;
            case 5:
                printf("Enter username: ");
                scanf("%s", username);
                printf("Select option to modify user info:\n");
                printf("1. User Name (Username)\n");
                printf("2. Home directory\n");
                printf("3. Shell\n");
                printf("Enter your choice: ");
                scanf("%d", &choice);
                switch (choice) {
                    case 1:
                        printf("Enter new username: ");
                        scanf("%s", newInfo);
                        strcpy(command,"sudo usermod -l ");
                        strcat(command,newInfo);
                        strcat(command," ");
                        strcat(command,username);
                        system(command);
                        break;
                    case 2:
                        printf("Enter new home directory: ");
                        scanf("%s", newInfo);
                        strcpy(command,"sudo usermod -d ");
                        strcat(command,newInfo);
                        strcat(command," ");
                        strcat(command,username);
                        system(command);
                        break;
                    case 3:
                        printf("Enter new shell: ");
                        scanf("%s", newInfo);
                        strcpy(command,"sudo usermod -s ");
                        strcat(command,newInfo);
                        strcat(command," ");
                        strcat(command,username);
                        system(command);
                        break;
                    default:
                        printf("Invalid option!\n");
                        break;
                }
                break;
            case 6:
                printf("Enter username: ");
                scanf("%s", username);
                printf("Select option to modify account info:\n");
                printf("1. Password\n");
                printf("1. Password expiration\n");
                printf("2. Account expiration\n");
                printf("Enter your choice: ");
                scanf("%d", &choice);
                switch (choice) {
                    case 1:
                        strcpy(command,"sudo passwd ");
                        strcat(command,username);
                        system(command);
                        break;
                    case 2:
                        printf("Enter new password expiration date : ");
                        scanf("%s", value);
                        strcpy(command,"sudo chage -M ");
                        strcat(command,value);
                        strcat(command," ");
                        strcat(command,username);
                        system(command);
                        break;
                    case 3:
                        printf("Enter new account expiration (YYYY-MM-DD): ");
                        scanf("%s", value);
                        strcpy(command,"sudo usermod -e ");
                        strcat(command,value);
                        strcat(command," ");
                        strcat(command,username);
                        system(command);
                        break;
                    default:
                        printf("Invalid option!\n");
                        break;
                }
                break;
            case 7:
                printf("Enter username: ");
                scanf("%s", username);
                printf("Enter groupname: ");
                scanf("%s", groupname);
                strcpy(command, "sudo usermod -g ");
                strcat(command, groupname);
                strcat(command, " ");
                strcat(command, username);
                system(command);
                break;
            case 8:
                strcpy(command,"awk -F':' '{ print $1}' /etc/passwd");
                system(command);
                break;
            case 9:
                strcpy(command,"cat /etc/group");
                system(command);
                break;
            case 10:
                printf("Exiting...\n");
                exit(0);
            default:
                printf("Invalid choice!\n");
        }
    }

    return 0;
}

