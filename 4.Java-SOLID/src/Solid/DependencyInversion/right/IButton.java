package Solid.DependencyInversion.right;

// bu arayüz gelecekte farklı cihazları çalıştıracak düğmelere takmamız gerektiğinde bu konuda bize esneklik sağlayacak.

interface IButton {

    boolean isOpen();
    void press();

}
