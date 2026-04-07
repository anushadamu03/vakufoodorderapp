package com.vaku.foodapp.email_notification.services;

import com.vaku.foodapp.email_notification.dtos.NotificationDTO;

public interface NotificationService {

    void sendEmail(NotificationDTO notificationDTO);

}
