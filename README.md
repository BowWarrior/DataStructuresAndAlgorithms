Directions to the Aufgabe:

Erstellen Sie zwei Unterklassen der gegebenen Klasse SimpleLinkedList, welche folgende
Strategien für adaptive Listen unterstützen:
a) Move-To-Front: Wird ein Element in der Liste verwendet (z.B. gesucht), wird es an den
Anfang der Liste verschoben. Diese Strategie bevorzugt Elemente, die häufig oder kürzlich
verwendet wurden, da sie schneller zugänglich werden.
b) Transpose: Bei Verwendung eines Elements wird es mit seinem direkten Vorgänger in der
Liste vertauscht. Dadurch wandern oft genutzte Elemente allmählich nach vorne, jedoch
langsamer als bei Move-to-Front.
Überschreiben Sie dazu die E get(int) Methode und reorganisieren Sie die Listenelemente
entsprechend der Strategie.
