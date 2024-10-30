package car;

public class PathClue {
    /*
    Path getParent()
Возвращает родительскую директорию
Path getFileName()

Возвращает имя файла без директории
Path getRoot()

Возвращает корневую директорию из пути
boolean isAbsolute()

Проверяет, что текущий путь — абсолютный
Path toAbsolutePath()

Преобразует путь в абсолютный
Path normalize()

Убирает шаблоны в имени директории.
Path resolve(Path other)

Строит новый абсолютный путь из абсолютного и относительного.
Path relativize(Path other)

Получает относительный путь из двух абсолютных путей.
boolean startsWith(Path other)

Проверяет, что текущий путь начинается с пути
boolean endsWith(Path other)

Проверяет, что текущий путь заканчивается на путь
int getNameCount()

Дробит путь на части с помощью разделителя /.
Возвращает количество частей.
Path getName(int index)

Дробит путь на части с помощью разделителя /.
Возвращает часть по ее номеру.

Path subpath(int beginIndex, int endIndex)
Дробит путь на части с помощью разделителя /.
Возвращает часть пути, заданную интервалом.

File toFile()
Преобразует объект Path в устаревший объект File

URI toUri()
Преобразует объект Path в объект типа URI

/*
                                              РАБОТА С ФАЙЛОМА ЧЕРЕЗ PATH
     /*
     Path createFile(Path path)
Создает новый файл с путем path


Path createDirectory(Path path)
Создает новую директорию


Path createDirectories(Path path)
Создает несколько директорий

Path createTempFile(prefix, suffix)
Создает временный файл

Path createTempDirectory(prefix)
Создает временную директорию

void delete(Path path)
Удаляет файл или директорию, если она пуста

Path copy(Path src, Path dest)
Копирует файл

Path move(Path src, Path dest)
Перемещает файл

boolean isDirectory(Path path)
Проверяет, что путь — это директория, а не файл

boolean isRegularFile(Path path)
Проверяет, что путь — это файл, а не директория

boolean exists(Path path)
Проверяет, что объект по заданному пути существует

long size(Path path)
Возвращает размер файла

byte[] readAllBytes(Path path)
Возвращает все содержимое файла в виде массива байт

String readString(Path path)
Возвращает все содержимое файла в виде строки

List<String> readAllLines(Path path)
Возвращает все содержимое файла в виде списка строк

Path write(Path path, byte[])
Записывает в файл массив байт

Path writeString(Path path, String str)
Записывает в файл строку

DirectoryStream<Path> newDirectoryStream(Path dir)
Возвращает коллекцию файлов (и поддиректорий) из заданной директории
     */

}
