  try {
            int i = 0;
            FileInputStream fin = new FileInputStream("test.txt");

            while ((i = fin.read()) != -1) {
                System.out.print((char) i);

            }
            fin.close();

        } catch (Exception e) {
            System.out.println(e);
        }