package ru.rail.ecommerce.models;

import java.time.LocalDateTime;

public class Notification {

    private int notificationId;
    private String title;
    private LocalDateTime notificationDate;
    private String textContent;
}
//- Админ может пополнять баланс пользователя;
//        - Админ может просматривать информацию о пользователях, удалять и замораживать их аккаунты;
//        - Админ может отправлять пользователям уведомления;
//        - Уведомления состоят из:                              // Class Notefication
//        - Заголовка уведомления;
//        - Даты уведомления;
//        - Текстового содержания уведомления.