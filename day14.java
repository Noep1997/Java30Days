// Add your code here
  Difference(int[] array) {
      elements = array;
  }

  int computeDifference() {
      maximumDifference = 0;
      for (int i = 0; i < elements.length; i++) {
          for (int j = 0; j < elements.length; j++) {
              if (maximumDifference < Math.abs(elements[j] - elements[i])) {
                  maximumDifference = Math.abs(elements[j] - elements[i]);
              }
          }
      }
      return maximumDifference;
  }
