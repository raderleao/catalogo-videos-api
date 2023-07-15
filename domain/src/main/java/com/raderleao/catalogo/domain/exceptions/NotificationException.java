package com.raderleao.catalogo.domain.exceptions;

import com.raderleao.catalogo.domain.validation.handler.Notification;

import java.util.List;

public class NotificationException extends DomainException{

    public NotificationException(final String aMessage, final Notification notification) {
        super(aMessage, notification.getErrors());
    }
    public static NotificationException with(final String message, final Notification notification) {
        return new NotificationException(message, notification);
    }
}
