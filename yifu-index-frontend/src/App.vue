<template>
  <div
    style="
      font-family: 'Inter', sans-serif;
      background: #f5f7fa;
      color: #606266;
      min-height: 100vh;
      display: flex;
      flex-direction: column;
    "
  >
    <Navbar />
    <main style="flex-grow: 1; padding-top: 80px">
<!--      <Banner />-->
      <section id="news" style="padding: 48px 0; background: #fff">
        <div style="max-width: 1200px; margin: 0 auto; padding: 0 24px">
          <NewsFilter />
          <NewsHeadline />
        </div>
      </section>
    </main>
  </div>
</template>

<script setup>
import Navbar from './components/Navbar.vue'
import NewsFilter from './components/NewsFilters.vue'
import NewsHeadline from './components/NewsHeadline.vue'
</script>
