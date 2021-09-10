## 차트에 상호작용이 가능하도록 함
import streamlit as st
import numpy as np
import pandas as pd
import time

# 체크박스 이용
if st.checkbox('Show Data Frame'):
    chart_data = pd.DataFrame(
        np.random.randn(20,3),
        columns = ['A', 'B', 'C']
    )

    chart_data

st.write('interactivity with widget') 


# 
df = pd.DataFrame({
    'first column': [1,2,3,4,5],
})

# option = st.selectbox(
#     'Which number do you like best?',
#      df['first column'])

# 'You selected: ', option
option = st.sidebar.selectbox(
    'Which number do you like best?',
     df['first column'])

'You selected:', option

'Starting a long computation...'

# Add a placeholder
latest_iteration = st.empty()
bar = st.progress(0)

for i in range(100):
  # Update the progress bar with each iteration.
  latest_iteration.text(f'Iteration {i+1}')
  bar.progress(i + 1)
  time.sleep(0.1)

'...and now we\'re done!'