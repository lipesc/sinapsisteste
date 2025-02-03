<template>
  <SubestacaoForm :substacoes="substacoes" />
</template>
<script setup>
import SubestacaoForm from '../components/SubestacaoForm.vue'
import { ref } from 'vue';
import { useToast } from "vue-toastification";

const toast = useToast();
const substacoes = ref([]);
const fetchData = async () => {
  try {
    const response = await fetch('http://localhost:5000/testando');
    if (!response.ok) {
      throw new Error('Error em receber dados do spring');
    }
    const data = await response.json();
    substacoes.value = data;
    toast.success("dados recebidos do spring", {
      timeout: 2000
    });
  } catch (error) {
    toast.error(error.message);
  }
};

fetchData();
</script>