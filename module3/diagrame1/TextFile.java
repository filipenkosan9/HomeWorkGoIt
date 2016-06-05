package ua.goit.module3.diagrame1;

/**
 * Created by Alex on 04.06.2016.
 */
public class TextFile extends File {
        private String text;

        public String getText()
        {
            return text;
        }

        public void setText(String text)
        {
            this.text = text;
        }
}