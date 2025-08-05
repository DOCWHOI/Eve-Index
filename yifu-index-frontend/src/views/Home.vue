<template>
  <main>
    <HeroSection />
    <NewsHeadline />
  </main>
</template>

<script setup>
import HeroSection from '../components/HeroSection.vue'
import NewsHeadline from '../components/NewsHeadline.vue'
</script>

<style scoped>
main {
  margin-top: 64px; /* 为固定导航栏留出空间 */
}
</style>
