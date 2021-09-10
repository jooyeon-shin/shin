# streamlit import 웹 퍼블리싱
import streamlit as st
import numpy as np
import pandas as pd

# add 간단한 문자열을 출력
st.title('안녕하세요')
st.write('데이터프레임 구성, 테이블을 만들어 보자.')
st.write(pd.DataFrame({
    'column1': [1,2,3,4],
    'column2': [10,20,30,40]
}))

# use magic
"""
# 안녕하세요, 신주연입니다.
데이터프레임 구성, 테이블을 만들어 보자.
"""

df = pd.DataFrame({
    '학   번': [2001,2002,2003,2004],
    '성   명': ['홍길동','춘향이','갑돌이','갑순이']
})
df

# 차트와 지도 그리기
# line chart
chart_data = pd.DataFrame(
    np.random.randn(20, 3),
    columns = ['A', 'B', 'C']
)

st.line_chart(chart_data)

#plot map
map_data = pd.DataFrame(
    np.random.randn(10, 2) / [50, 50] + [36.643910, 127.487607],
    columns = ['lat', 'lon']
)

st.map(map_data)